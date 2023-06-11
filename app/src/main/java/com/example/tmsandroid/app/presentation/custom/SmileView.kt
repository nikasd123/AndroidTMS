package com.example.tmsandroid.app.presentation.custom

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View
import kotlin.math.min

/**
 * TODO Refactor
 * - add companion object +
 * - apply kotlin +
 * - single responsibility +
 * - naming parameters +
 * - use internal -
 *
 */

internal class SmileView(
    context: Context, attributes: AttributeSet
) : View(context, attributes) {

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        size = min(measuredWidth, measuredHeight)

        setMeasuredDimension(size, size)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        drawElements(canvas)
    }

    private fun drawElements(canvas: Canvas) {
        drawFaceBackground(canvas)
        drawLeftEye(canvas)
        drawRightEye(canvas)
        drawMouth(canvas)
    }

    private fun drawFaceBackground(canvas: Canvas) {

        paint.apply {
            color = getDefaultFaceColor()
            style = Paint.Style.FILL
        }

        val faceRadius = getSize() / 2f

        getSize().let {
            canvas.drawCircle(
                it / 2f,
                it / 2f,
                faceRadius,
                paint
            )
        }

        paint.apply {
            color = getDefaultBorderColor()
            style = Paint.Style.STROKE
            strokeWidth = getDefaultBorderWidth()
        }

        getSize().let {
            canvas.drawCircle(
                it / 2f,
                it / 2f,
                faceRadius - getDefaultBorderWidth() / 2f,
                paint
            )
        }
    }

    private fun drawLeftEye(canvas: Canvas) {

        paint.apply {
            color = getDefaultEyesColor()
            style = Paint.Style.FILL
        }

        val leftEyeRect =
            getSize().let {
                RectF(
                    it * 0.32f,
                    it * 0.23f,
                    it * 0.32f + eyeWidth,
                    it * 0.23f + eyeHeight
                )
            }
        canvas.drawOval(leftEyeRect, paint)
    }

    private fun drawRightEye(canvas: Canvas) {

        paint.apply {
            color = getDefaultEyesColor()
            style = Paint.Style.FILL
        }

        val rightEyeRect =
            getSize().let {
                RectF(
                    it * 0.57f,
                    it * 0.23f,
                    it * 0.57f + eyeWidth,
                    it * 0.23f + eyeHeight
                )
            }
        canvas.drawOval(rightEyeRect, paint)
    }

    private fun drawMouth(canvas: Canvas) {

        paint.apply {
            color = getDefaultMouthColor()
            style = Paint.Style.FILL
        }

        val mouthPath = Path()

        getSize().let {
            mouthPath.apply {
                moveTo(
                    it * 0.22f,
                    it * 0.7f
                )
                quadTo(
                    it * 0.50f,
                    it * 0.80f,
                    it * 0.78f,
                    it * 0.70f
                )
                quadTo(
                    it * 0.50f,
                    it * 0.90f,
                    it * 0.22f,
                    it * 0.70f
                )
            }
        }
        canvas.drawPath(mouthPath, paint)
    }

    companion object {
        private const val DEFAULT_FACE_COLOR = Color.YELLOW
        private const val DEFAULT_EYES_COLOR = Color.BLACK
        private const val DEFAULT_MOUTH_COLOR = Color.BLACK
        private const val DEFAULT_BORDER_COLOR = Color.BLACK
        private const val DEFAULT_BORDER_WIDTH = 4.0f

        private var size = 320

        private var paint = Paint(Paint.ANTI_ALIAS_FLAG)
        private val eyeWidth = getSize() * 0.11f
        private val eyeHeight = getSize() * 0.27f

        // Методы для получения параметров по умолчанию
        fun getDefaultFaceColor(): Int = DEFAULT_FACE_COLOR
        fun getDefaultEyesColor(): Int = DEFAULT_EYES_COLOR
        fun getDefaultMouthColor(): Int = DEFAULT_MOUTH_COLOR
        fun getDefaultBorderColor(): Int = DEFAULT_BORDER_COLOR
        fun getDefaultBorderWidth(): Float = DEFAULT_BORDER_WIDTH
        fun getSize(): Int = size
    }
}