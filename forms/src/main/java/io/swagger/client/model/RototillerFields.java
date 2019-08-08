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
import io.swagger.client.model.CNIL;
import io.swagger.client.model.GenericFormFields;
import io.swagger.client.model.Intermediary;
import io.swagger.client.model.Person;
import io.swagger.client.model.Tracking;
import java.io.IOException;

/**
 * RototillerFields
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-08T08:35:16.049Z")
public class RototillerFields extends GenericFormFields {
  @SerializedName("message")
  private String message = null;

  public RototillerFields message(String message) {
    this.message = message;
    return this;
  }

   /**
   * User message
   * @return message
  **/
  @ApiModelProperty(example = "I need an insurance.", value = "User message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RototillerFields rototillerFields = (RototillerFields) o;
    return Objects.equals(this.message, rototillerFields.message) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RototillerFields {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

