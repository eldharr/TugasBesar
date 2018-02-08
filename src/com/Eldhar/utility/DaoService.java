/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eldhar.utility;

/**
 *
 * @author Eldha Ramadhanty
 */
import java.util.List;

public interface DaoService<E> {

    int addData(E object);

    int deleteData(E object);

    int updateData(E object);

    List<E> showAllData();

}
