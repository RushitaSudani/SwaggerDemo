package org.technous.swaggerDemo.controller;import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
@Api(value = "SampleController", description = "Operations pertaining to sample entities")
public class SampleController {

    private List<String> sampleEntities = Arrays.asList("Entity1", "Entity2", "Entity3");

    @ApiOperation(value = "Get all sample entities", response = List.class)
    @GetMapping("/entities")
    public List<String> getAllSampleEntities() {
        return sampleEntities;
    }
}
