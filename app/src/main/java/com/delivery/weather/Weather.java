package com.delivery.weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Weather {

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("main")
@Expose
private String main;
@SerializedName("description")
@Expose
private String description;
@SerializedName("icon")
@Expose
private String icon;

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public String getMain() {
return main;
}

public void setMain(String main) {
this.main = main;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public String getIcon() {
return icon;
}

public void setIcon(String icon) {
this.icon = icon;
}

}