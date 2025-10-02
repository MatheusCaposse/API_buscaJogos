package br.com.AppJogo.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.util.List;

public class ConverteDados {
    ObjectMapper mapper = new ObjectMapper();

    public <T> T converterObjeto(String json, Class<T> classe){
        try{
            return mapper.readValue(json, classe);
        } catch (JsonMappingException e) {
            throw new RuntimeException(e);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public <T> List<T> converterLista(String json, Class<T> classe){
        try {
            CollectionType listType = mapper.getTypeFactory().constructCollectionType(List.class, classe);
            return mapper.readValue(json, listType);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
