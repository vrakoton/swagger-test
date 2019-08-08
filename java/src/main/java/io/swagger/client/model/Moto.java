/*
 * Forms submission
 * API work with forms
 *
 * OpenAPI spec version: 1.0.0
 * Contact: CARNEIN@allianz.fr
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Moto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-08T08:34:11.196Z")
public class Moto {
  @SerializedName("brand")
  private String brand = null;

  @SerializedName("model")
  private String model = null;

  public Moto brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * User vehicle brand
   * @return brand
  **/
  @ApiModelProperty(example = "BMW", value = "User vehicle brand")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Moto model(String model) {
    this.model = model;
    return this;
  }

   /**
   * User vehicle model
   * @return model
  **/
  @ApiModelProperty(example = "C 400", value = "User vehicle model")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Moto moto = (Moto) o;
    return Objects.equals(this.brand, moto.brand) &&
        Objects.equals(this.model, moto.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, model);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Moto {\n");
    
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

