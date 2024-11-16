/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package validator;

import domain.Role;

/**
 *
 * @author Nikolina
 */
public interface IValidator {

    public void validateLogin(String username, String password)throws ValidatorException;

    public void validateCreateNewUser(String firstname, String lastname, String email, String pass, Role role) throws ValidatorException;

    public void validateUpdateUser(Long id, String firstname, String lastname, String email, String password, Role role) throws ValidatorException;
    
}
