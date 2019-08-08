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
import io.swagger.client.model.ApiFormsCommonYamldefinitionsNetwork;
import java.io.IOException;

/**
 * Intermediary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-08T08:35:16.049Z")
public class Intermediary {
  @SerializedName("intermediaryCode")
  private String intermediaryCode = null;

  @SerializedName("intermediaryNetwork")
  private ApiFormsCommonYamldefinitionsNetwork intermediaryNetwork = null;

  @SerializedName("toppedCode")
  private String toppedCode = null;

  @SerializedName("toppedNetwork")
  private ApiFormsCommonYamldefinitionsNetwork toppedNetwork = null;

  public Intermediary intermediaryCode(String intermediaryCode) {
    this.intermediaryCode = intermediaryCode;
    return this;
  }

   /**
   * Intermediary code
   * @return intermediaryCode
  **/
  @ApiModelProperty(example = "H99076", value = "Intermediary code")
  public String getIntermediaryCode() {
    return intermediaryCode;
  }

  public void setIntermediaryCode(String intermediaryCode) {
    this.intermediaryCode = intermediaryCode;
  }

  public Intermediary intermediaryNetwork(ApiFormsCommonYamldefinitionsNetwork intermediaryNetwork) {
    this.intermediaryNetwork = intermediaryNetwork;
    return this;
  }

   /**
   * Get intermediaryNetwork
   * @return intermediaryNetwork
  **/
  @ApiModelProperty(value = "")
  public ApiFormsCommonYamldefinitionsNetwork getIntermediaryNetwork() {
    return intermediaryNetwork;
  }

  public void setIntermediaryNetwork(ApiFormsCommonYamldefinitionsNetwork intermediaryNetwork) {
    this.intermediaryNetwork = intermediaryNetwork;
  }

  public Intermediary toppedCode(String toppedCode) {
    this.toppedCode = toppedCode;
    return this;
  }

   /**
   * Intermediary code in case of user is topped
   * @return toppedCode
  **/
  @ApiModelProperty(example = "H99076", value = "Intermediary code in case of user is topped")
  public String getToppedCode() {
    return toppedCode;
  }

  public void setToppedCode(String toppedCode) {
    this.toppedCode = toppedCode;
  }

  public Intermediary toppedNetwork(ApiFormsCommonYamldefinitionsNetwork toppedNetwork) {
    this.toppedNetwork = toppedNetwork;
    return this;
  }

   /**
   * Get toppedNetwork
   * @return toppedNetwork
  **/
  @ApiModelProperty(value = "")
  public ApiFormsCommonYamldefinitionsNetwork getToppedNetwork() {
    return toppedNetwork;
  }

  public void setToppedNetwork(ApiFormsCommonYamldefinitionsNetwork toppedNetwork) {
    this.toppedNetwork = toppedNetwork;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Intermediary intermediary = (Intermediary) o;
    return Objects.equals(this.intermediaryCode, intermediary.intermediaryCode) &&
        Objects.equals(this.intermediaryNetwork, intermediary.intermediaryNetwork) &&
        Objects.equals(this.toppedCode, intermediary.toppedCode) &&
        Objects.equals(this.toppedNetwork, intermediary.toppedNetwork);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intermediaryCode, intermediaryNetwork, toppedCode, toppedNetwork);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Intermediary {\n");
    
    sb.append("    intermediaryCode: ").append(toIndentedString(intermediaryCode)).append("\n");
    sb.append("    intermediaryNetwork: ").append(toIndentedString(intermediaryNetwork)).append("\n");
    sb.append("    toppedCode: ").append(toIndentedString(toppedCode)).append("\n");
    sb.append("    toppedNetwork: ").append(toIndentedString(toppedNetwork)).append("\n");
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

