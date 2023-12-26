package mk.dmt.mb.controller

import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/phone")
class PhoneController {


    @PostMapping(consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun bookPhone():ResponseEntity<Any> {
        return ResponseEntity<Any>(HttpStatus.ACCEPTED);
    }

    @PostMapping(consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun returnPhone():ResponseEntity<Any> {
        return ResponseEntity<Any>(HttpStatus.ACCEPTED);
    }

    @GetMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getPhoneInfo() {

    }

    @GetMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getPhonesInfo() {

    }

    @PutMapping(value = ["{documentId}"], consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun updatePhoneStatus() {}
}