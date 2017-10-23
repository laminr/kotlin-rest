package biz.eventually.atpl.api.rest

import biz.eventually.atpl.api.data.domain.Source
import biz.eventually.atpl.api.service.SourceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by laminr on 20/10/2017.
 */
@RestController
@RequestMapping(value = "source")
class SourceWs {

    @Autowired
    lateinit var service: SourceService

    @GetMapping("/")
    fun getSources(): List<Source> {
        return service.findAll()
    }

    @GetMapping(value = "/id/{sourceId}")
    fun getSource(@PathVariable sourceId : Long) : Source {
        return service.findById(sourceId)
    }
}