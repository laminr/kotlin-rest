package biz.eventually.atpl.api.data.repository

import biz.eventually.atpl.api.data.domain.Source
import org.springframework.data.repository.CrudRepository

/**
 * Created by laminr on 20/10/2017.
 */
interface SourceRepository: CrudRepository<Source, Long> {

    override fun findAll(): List<Source>

    fun findById(id: Long): Source
}