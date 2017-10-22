package biz.eventually.atpl.api.data.domain

import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * Created by laminr on 22/10/2017.
 */
data class User(@Id @GeneratedValue val id: Long, var username: String = "")