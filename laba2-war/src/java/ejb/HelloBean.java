/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author lomatik
 */
@ManagedBean
@RequestScoped
public class HelloBean {
    public String getMessage() {
      return "Увійдіть!";
  }

  
}
