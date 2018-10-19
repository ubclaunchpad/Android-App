package ca.ubc.eml.soiltopargraphy.editor.ui.quizpanel

/**
 * QuizPanel will hold question, answers (which includes a correct answer)
 */

data class QuizPanel(
        val question: String,
        val answer: String // TODO: implements how to differentiate correct and wrong answers
)