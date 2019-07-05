/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unbabel.challenge.conf;

import java.util.UUID;
import org.dozer.DozerBeanMapper;
import org.dozer.classmap.ClassMap;
import org.dozer.fieldmap.FieldMap;
import org.dozer.loader.api.BeanMappingBuilder;
import org.dozer.loader.api.TypeMappingOptions;
import org.hibernate.collection.spi.PersistentCollection;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author LCRISTINI00
 */
@Configuration
@EnableAutoConfiguration
public class MapperConfig {
    @Bean
    public DozerBeanMapper mapper() {
        DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
        dozerBeanMapper.setCustomFieldMapper((Object source, Object destination, Object sourceFieldValue,
                ClassMap classMap, FieldMap fieldMapping) -> {
            // Check if field is a Hibernate PersistentSet
            if (!(sourceFieldValue instanceof PersistentCollection)) {
                // Allow dozer to map as normal
                return false;
            }
            // Check if field is already initialized
            if (((PersistentCollection) sourceFieldValue).wasInitialized()) {
                // Allow dozer to map as normal
                return false;
            }
            destination = null;
            return true;
        });
        return dozerBeanMapper;
    }
}
