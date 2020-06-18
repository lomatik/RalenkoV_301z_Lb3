/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

/**
 *
 * @author lomatik
 */
import java.io.Serializable;

import javax.faces.bean.CustomScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name= ColorEntryBean.BEAN_NAME)
@CustomScoped(value = "#{window}")
public class ColorEntryBean implements Serializable{
    public static final String BEAN_NAME = "colorEntryBean";
    public String getBeanName() { 
        return BEAN_NAME; 
    }

    private String selectedColor, title="Choose a Color";

    public String getSelectedColor() {
        return selectedColor;
    }

    public void setSelectedColor(String selectedColor) {
        this.selectedColor = selectedColor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}