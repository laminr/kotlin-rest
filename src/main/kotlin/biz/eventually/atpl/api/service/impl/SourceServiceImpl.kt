package biz.eventually.atpl.api.service.impl

import biz.eventually.atpl.api.data.domain.Source
import biz.eventually.atpl.api.data.repository.SourceRepository
import biz.eventually.atpl.api.service.SourceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by laminr on 20/10/2017.
 */
@Service
class SourceServiceImpl: SourceService {

    @Autowired
    lateinit var repository: SourceRepository

    override fun findAll(): List<Source> {
        return repository.findAll()
    }

    override fun findById(id: Long): Source {
        return repository.findById(id)
    }
}