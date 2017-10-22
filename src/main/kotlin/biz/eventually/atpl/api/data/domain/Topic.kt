package biz.eventually.atpl.api.data.domain

/**
 * Created by laminr on 22/10/2017.
 */
data class Topic(val id: Long = -1) {

    var subject: Subject? = null

    var questions: List<String> = listOf()
}