package biz.eventually.atpl.api.data.domain

import java.util.*
import javax.persistence.*

/**
 * Created by laminr on 22/10/2017.
 */
data class Subject(@Id @GeneratedValue val id: Long = -1) {

    var name: String = ""

    //@ManyToOne
    //@JoinColumn(name = "source_id")
    var source: Source = Source()

    //@OneToMany(mappedBy = "subject", cascade = arrayOf(CascadeType.ALL))
    var topics: List<Topic> = listOf()

    var public: Boolean = false

    //@ManyToMany
    //@JoinTable(name = "subject_user",
//            joinColumns = arrayOf(JoinColumn(name = "subject_id", referencedColumnName = "id")),
//            inverseJoinColumns = arrayOf(JoinColumn(name = "user_id", referencedColumnName = "id"))
//    )
    var authorisedUsers: List<User>? = null

    var updated: Date = Date()
}