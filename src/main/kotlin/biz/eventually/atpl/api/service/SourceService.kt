package biz.eventually.atpl.api.service

import biz.eventually.atpl.api.data.domain.Source

/**
 * Created by laminr on 20/10/2017.
 */
interface SourceService {

    fun findAll() : List<Source>

    fun findById(id : Long): Source
}