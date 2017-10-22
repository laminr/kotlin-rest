package biz.eventually.atpl.api.data.domain

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

/**
 * Created by laminr on 20/10/2017.
 */
@Entity
@Table(name = "source")
data class Source(@Id @GeneratedValue val id : Long = -1, val name : String = "", val updated: Date = Date())