package com.example.demo;

import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import static org.springframework.hateoas.server.reactive.WebFluxLinkBuilder.linkTo;
import static org.springframework.hateoas.server.reactive.WebFluxLinkBuilder.methodOn;


@RestController
public class ModelController {

    @GetMapping(path = "test")
    public Mono<EntityModel<Model>> health() {
        return Mono.defer(() -> Mono.just(new Model("Test")))
                .flatMap(modelX1 -> linkTo(
                        methodOn(ModelController.class).health()).withSelfRel().toMono()
                        .map(link -> modelX1.removeLinks().add(link))).subscribeOn(Schedulers.boundedElastic());
    }
}
