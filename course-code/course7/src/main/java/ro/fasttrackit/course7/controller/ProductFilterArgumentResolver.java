package ro.fasttrackit.course7.controller;

import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import ro.fasttrackit.course7.model.ProductFilters;

import java.util.Arrays;
import java.util.List;

@Component
public class ProductFilterArgumentResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return ProductFilters.class.isAssignableFrom(parameter.getParameterType());
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        String[] names = webRequest.getParameterValues("name");
        return new ProductFilters(
                Arrays.stream(names)
                        .toList(),
                List.of(), List.of(), List.of());
    }
}
