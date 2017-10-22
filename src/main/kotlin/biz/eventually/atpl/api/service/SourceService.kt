package biz.eventually.atpl.api.service

import biz.eventually.atpl.api.data.domain.Source
import biz.eventually.atpl.api.data.repository.SourceRepository
import org.springframework.stereotype.Service

/**
 * Created by laminr on 20/10/2017.
 */
interface SourceService {

    fun findAll() : List<Source>

}