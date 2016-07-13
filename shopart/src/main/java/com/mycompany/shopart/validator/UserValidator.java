/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.validator;

import com.mycompany.shopart.model.User;
import java.util.HashSet;
import java.util.Set;
import javax.validation.ConstraintViolation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 *
 * @author 985072
 */
public class UserValidator  implements Validator {

    @Autowired
    private javax.validation.Validator beanValidator;
    private Set<Validator> springValidators;
    
    public UserValidator() {
        springValidators = new HashSet<Validator>();
    }
    public void setSpringValidators(Set<Validator>springValidators) {
        this.springValidators = springValidators;
    }
    @Override
    public boolean supports(Class<?> type) {
        return User.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Set<ConstraintViolation<Object>> constraintViolations = beanValidator.validate(target);
        for(ConstraintViolation<Object> constraintViolation :constraintViolations) {
            String propertyPath = constraintViolation.getPropertyPath().toString();
            String message = constraintViolation.getMessage();
            errors.rejectValue(propertyPath,"", message);
        }
        
        for(Validator validator : springValidators) {
            validator.validate(target, errors);
        }
    }
}
