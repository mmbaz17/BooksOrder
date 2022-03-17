/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookorder.repository;

/**
 *
 * @author Muzamiru.Mbaziira
 */
import org.springframework.data.repository.CrudRepository;
//repository that extends CrudRepository
import com.bookorder.model.Books;

public interface BooksRepository extends CrudRepository<Books, Integer>
{
}
