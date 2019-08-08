# FormsApi

All URIs are relative to *https://forms.swagger.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**autocollectionSubmission**](FormsApi.md#autocollectionSubmission) | **POST** /forms/autocollection | Submission of collection cars form.
[**automalusSubmission**](FormsApi.md#automalusSubmission) | **POST** /forms/automalus | Submission of automalus form.
[**backupAuto**](FormsApi.md#backupAuto) | **POST** /forms/backupAuto | Submission of backupAuto form.
[**backupHabitation**](FormsApi.md#backupHabitation) | **POST** /forms/backupHabitation | Submission of backupHabitation form.
[**bikeSubmission**](FormsApi.md#bikeSubmission) | **POST** /forms/bike | Submission of bike form.
[**boatSubmission**](FormsApi.md#boatSubmission) | **POST** /forms/boat | Submission of boat form.
[**bordererSubmission**](FormsApi.md#bordererSubmission) | **POST** /forms/borderer | Submission of borderer form.
[**capitalTransfer**](FormsApi.md#capitalTransfer) | **POST** /forms/capitalTransfer | Submission of CapitalTransfer form.
[**caravanSubmission**](FormsApi.md#caravanSubmission) | **POST** /forms/caravan | Submission of caravan form.
[**completRetirement**](FormsApi.md#completRetirement) | **POST** /forms/completRetirement | Submission of completRetirement form.
[**contactSubmission**](FormsApi.md#contactSubmission) | **POST** /forms/contact | Submission of contact form.
[**deathSubmission**](FormsApi.md#deathSubmission) | **POST** /forms/death | Submission of death form.
[**dependencySubmission**](FormsApi.md#dependencySubmission) | **POST** /forms/dependency | Submission of dependency form.
[**energySubmission**](FormsApi.md#energySubmission) | **POST** /forms/energy | Submission of energy form.
[**equipmentSubmission**](FormsApi.md#equipmentSubmission) | **POST** /forms/equipment | Submission of equipment form.
[**funeralSubmission**](FormsApi.md#funeralSubmission) | **POST** /forms/funeral | Submission of funeral form.
[**grandchildren**](FormsApi.md#grandchildren) | **POST** /forms/grandchildren | Submission of Grandchildren form.
[**handicapSubmission**](FormsApi.md#handicapSubmission) | **POST** /forms/handicap | Submission of handicap form.
[**hoverboardSubmission**](FormsApi.md#hoverboardSubmission) | **POST** /forms/hoverboard | Submission of hoverboard form.
[**hunterSubmission**](FormsApi.md#hunterSubmission) | **POST** /forms/hunter | Submission of hunter form.
[**improveRetirement**](FormsApi.md#improveRetirement) | **POST** /forms/improveRetirement | Submission of Improve Retirement form.
[**inheritanceRight**](FormsApi.md#inheritanceRight) | **POST** /forms/inheritanceRight | Submission of InheritanceRight form.
[**lifeInsurance**](FormsApi.md#lifeInsurance) | **POST** /forms/lifeInsurance | Submission of LifeInsurance form.
[**localSubmission**](FormsApi.md#localSubmission) | **POST** /forms/local | Submission of local form.
[**motoSubmission**](FormsApi.md#motoSubmission) | **POST** /forms/moto | Submission of moto form.
[**nolicenseSubmission**](FormsApi.md#nolicenseSubmission) | **POST** /forms/nolicense | Submission of no licence cars form.
[**patrimonySubmission**](FormsApi.md#patrimonySubmission) | **POST** /forms/patrimony | Submission of patrimony form.
[**petSubmission**](FormsApi.md#petSubmission) | **POST** /forms/pet | Submission of pet form.
[**poolSubmission**](FormsApi.md#poolSubmission) | **POST** /forms/pool | Submission of pool form.
[**providentSubmission**](FormsApi.md#providentSubmission) | **POST** /forms/provident | Submission of provident form.
[**quadSubmission**](FormsApi.md#quadSubmission) | **POST** /forms/quad | Submission of quad form.
[**realEstate**](FormsApi.md#realEstate) | **POST** /forms/realEstate | Submission of realEstate form.
[**retirementCapital**](FormsApi.md#retirementCapital) | **POST** /forms/retirementCapital | Submission of retirementCapital form.
[**rightSubmission**](FormsApi.md#rightSubmission) | **POST** /forms/rights | Submission of rights form.
[**rototillerSubmission**](FormsApi.md#rototillerSubmission) | **POST** /forms/rototiller | Submission of rototiller form.
[**savingTax**](FormsApi.md#savingTax) | **POST** /forms/savingTax | Submission of SavingTax form.
[**schoolSubmission**](FormsApi.md#schoolSubmission) | **POST** /forms/school | Submission of school form.
[**socialSubmission**](FormsApi.md#socialSubmission) | **POST** /forms/social | Submission of social form.
[**sporthighSubmission**](FormsApi.md#sporthighSubmission) | **POST** /forms/sporthigh | Submission of sporthigh form.
[**sportlowSubmission**](FormsApi.md#sportlowSubmission) | **POST** /forms/sportlow | Submission of sports low level form.
[**winecellarSubmission**](FormsApi.md#winecellarSubmission) | **POST** /forms/winecellar | Submission of wine cellar form.
[**workstopSubmission**](FormsApi.md#workstopSubmission) | **POST** /forms/workstop | Submission of workstop form.


<a name="autocollectionSubmission"></a>
# **autocollectionSubmission**
> String autocollectionSubmission(criteria)

Submission of collection cars form.

Process for autocollection form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
AutocollectionFields criteria = new AutocollectionFields(); // AutocollectionFields | autocollection submission
try {
    String result = apiInstance.autocollectionSubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#autocollectionSubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**AutocollectionFields**](AutocollectionFields.md)| autocollection submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="automalusSubmission"></a>
# **automalusSubmission**
> String automalusSubmission(criteria)

Submission of automalus form.

Process for automalus form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
AutomalusFields criteria = new AutomalusFields(); // AutomalusFields | Form submission
try {
    String result = apiInstance.automalusSubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#automalusSubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**AutomalusFields**](AutomalusFields.md)| Form submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="backupAuto"></a>
# **backupAuto**
> String backupAuto(criteria)

Submission of backupAuto form.

Process for back up auto form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
BackupAutoFields criteria = new BackupAutoFields(); // BackupAutoFields | backupAuto submission
try {
    String result = apiInstance.backupAuto(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#backupAuto");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**BackupAutoFields**](BackupAutoFields.md)| backupAuto submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="backupHabitation"></a>
# **backupHabitation**
> String backupHabitation(criteria)

Submission of backupHabitation form.

Process for back up habitation form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
BackupHabitationFields criteria = new BackupHabitationFields(); // BackupHabitationFields | backupHabitation submission
try {
    String result = apiInstance.backupHabitation(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#backupHabitation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**BackupHabitationFields**](BackupHabitationFields.md)| backupHabitation submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="bikeSubmission"></a>
# **bikeSubmission**
> String bikeSubmission(criteria)

Submission of bike form.

Process for bike form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
BikeFields criteria = new BikeFields(); // BikeFields | bike submission
try {
    String result = apiInstance.bikeSubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#bikeSubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**BikeFields**](BikeFields.md)| bike submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="boatSubmission"></a>
# **boatSubmission**
> String boatSubmission(criteria)

Submission of boat form.

Process for boat form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
BoatFields criteria = new BoatFields(); // BoatFields | Boat submission
try {
    String result = apiInstance.boatSubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#boatSubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**BoatFields**](BoatFields.md)| Boat submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="bordererSubmission"></a>
# **bordererSubmission**
> String bordererSubmission(criteria)

Submission of borderer form.

Process for borderer form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
BordererFields criteria = new BordererFields(); // BordererFields | borderer submission
try {
    String result = apiInstance.bordererSubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#bordererSubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**BordererFields**](BordererFields.md)| borderer submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="capitalTransfer"></a>
# **capitalTransfer**
> String capitalTransfer(criteria)

Submission of CapitalTransfer form.

Process for CapitalTransfer form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
CapitalTransferFields criteria = new CapitalTransferFields(); // CapitalTransferFields | capitalTransfer submission
try {
    String result = apiInstance.capitalTransfer(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#capitalTransfer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**CapitalTransferFields**](CapitalTransferFields.md)| capitalTransfer submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="caravanSubmission"></a>
# **caravanSubmission**
> String caravanSubmission(criteria)

Submission of caravan form.

Process for caravan form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
CaravanFields criteria = new CaravanFields(); // CaravanFields | Form submission
try {
    String result = apiInstance.caravanSubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#caravanSubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**CaravanFields**](CaravanFields.md)| Form submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="completRetirement"></a>
# **completRetirement**
> String completRetirement(criteria)

Submission of completRetirement form.

Process for completRetirement form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
CompletRetirementFields criteria = new CompletRetirementFields(); // CompletRetirementFields | completRetirement submission
try {
    String result = apiInstance.completRetirement(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#completRetirement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**CompletRetirementFields**](CompletRetirementFields.md)| completRetirement submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contactSubmission"></a>
# **contactSubmission**
> String contactSubmission(criteria)

Submission of contact form.

Process for contact form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
ContactFields criteria = new ContactFields(); // ContactFields | contact submission
try {
    String result = apiInstance.contactSubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#contactSubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**ContactFields**](ContactFields.md)| contact submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deathSubmission"></a>
# **deathSubmission**
> String deathSubmission(criteria)

Submission of death form.

Process for death form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
DeathFields criteria = new DeathFields(); // DeathFields | death submission
try {
    String result = apiInstance.deathSubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#deathSubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**DeathFields**](DeathFields.md)| death submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dependencySubmission"></a>
# **dependencySubmission**
> String dependencySubmission(criteria)

Submission of dependency form.

Process for dependency form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
DependencyFields criteria = new DependencyFields(); // DependencyFields | dependency submission
try {
    String result = apiInstance.dependencySubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#dependencySubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**DependencyFields**](DependencyFields.md)| dependency submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="energySubmission"></a>
# **energySubmission**
> String energySubmission(criteria)

Submission of energy form.

Process for energy form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
EnergyFields criteria = new EnergyFields(); // EnergyFields | energy submission
try {
    String result = apiInstance.energySubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#energySubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**EnergyFields**](EnergyFields.md)| energy submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="equipmentSubmission"></a>
# **equipmentSubmission**
> String equipmentSubmission(criteria)

Submission of equipment form.

Process for equipment form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
EquipmentFields criteria = new EquipmentFields(); // EquipmentFields | equipment submission
try {
    String result = apiInstance.equipmentSubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#equipmentSubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**EquipmentFields**](EquipmentFields.md)| equipment submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="funeralSubmission"></a>
# **funeralSubmission**
> String funeralSubmission(criteria)

Submission of funeral form.

Process for funeral form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
FuneralFields criteria = new FuneralFields(); // FuneralFields | funeral submission
try {
    String result = apiInstance.funeralSubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#funeralSubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**FuneralFields**](FuneralFields.md)| funeral submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="grandchildren"></a>
# **grandchildren**
> String grandchildren(criteria)

Submission of Grandchildren form.

Process for Grandchildren form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
GrandchildrenFields criteria = new GrandchildrenFields(); // GrandchildrenFields | grandchildren submission
try {
    String result = apiInstance.grandchildren(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#grandchildren");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**GrandchildrenFields**](GrandchildrenFields.md)| grandchildren submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="handicapSubmission"></a>
# **handicapSubmission**
> String handicapSubmission(criteria)

Submission of handicap form.

Process for handicap form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
HandicapFields criteria = new HandicapFields(); // HandicapFields | handicap submission
try {
    String result = apiInstance.handicapSubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#handicapSubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**HandicapFields**](HandicapFields.md)| handicap submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="hoverboardSubmission"></a>
# **hoverboardSubmission**
> String hoverboardSubmission(criteria)

Submission of hoverboard form.

Process for hoverboard form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
HoverboardFields criteria = new HoverboardFields(); // HoverboardFields | Form submission
try {
    String result = apiInstance.hoverboardSubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#hoverboardSubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**HoverboardFields**](HoverboardFields.md)| Form submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="hunterSubmission"></a>
# **hunterSubmission**
> String hunterSubmission(criteria)

Submission of hunter form.

Process hunter form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
HunterFields criteria = new HunterFields(); // HunterFields | hunter submission
try {
    String result = apiInstance.hunterSubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#hunterSubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**HunterFields**](HunterFields.md)| hunter submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="improveRetirement"></a>
# **improveRetirement**
> String improveRetirement(criteria)

Submission of Improve Retirement form.

Process for ImproveRetirement form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
ImproveRetirementFields criteria = new ImproveRetirementFields(); // ImproveRetirementFields | improveRetirement submission
try {
    String result = apiInstance.improveRetirement(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#improveRetirement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**ImproveRetirementFields**](ImproveRetirementFields.md)| improveRetirement submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="inheritanceRight"></a>
# **inheritanceRight**
> String inheritanceRight(criteria)

Submission of InheritanceRight form.

Process for InheritanceRight form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
InheritanceRightFields criteria = new InheritanceRightFields(); // InheritanceRightFields | inheritanceRight submission
try {
    String result = apiInstance.inheritanceRight(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#inheritanceRight");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**InheritanceRightFields**](InheritanceRightFields.md)| inheritanceRight submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="lifeInsurance"></a>
# **lifeInsurance**
> String lifeInsurance(criteria)

Submission of LifeInsurance form.

Process for LifeInsurance form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
LifeInsuranceFields criteria = new LifeInsuranceFields(); // LifeInsuranceFields | lifeInsurance submission
try {
    String result = apiInstance.lifeInsurance(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#lifeInsurance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**LifeInsuranceFields**](LifeInsuranceFields.md)| lifeInsurance submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="localSubmission"></a>
# **localSubmission**
> String localSubmission(criteria)

Submission of local form.

Process for local form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
LocalFields criteria = new LocalFields(); // LocalFields | local submission
try {
    String result = apiInstance.localSubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#localSubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**LocalFields**](LocalFields.md)| local submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="motoSubmission"></a>
# **motoSubmission**
> String motoSubmission(criteria)

Submission of moto form.

Process for moto form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
MotoFields criteria = new MotoFields(); // MotoFields | Form submission
try {
    String result = apiInstance.motoSubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#motoSubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**MotoFields**](MotoFields.md)| Form submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nolicenseSubmission"></a>
# **nolicenseSubmission**
> String nolicenseSubmission(criteria)

Submission of no licence cars form.

Process for nolicense form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
NolicenseFields criteria = new NolicenseFields(); // NolicenseFields | no license submission
try {
    String result = apiInstance.nolicenseSubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#nolicenseSubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**NolicenseFields**](NolicenseFields.md)| no license submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patrimonySubmission"></a>
# **patrimonySubmission**
> String patrimonySubmission(criteria)

Submission of patrimony form.

Process for patrimony form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
PatrimonyFields criteria = new PatrimonyFields(); // PatrimonyFields | patrimony submission
try {
    String result = apiInstance.patrimonySubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#patrimonySubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**PatrimonyFields**](PatrimonyFields.md)| patrimony submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="petSubmission"></a>
# **petSubmission**
> String petSubmission(criteria)

Submission of pet form.

Process for pet form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
PetFields criteria = new PetFields(); // PetFields | pet submission
try {
    String result = apiInstance.petSubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#petSubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**PetFields**](PetFields.md)| pet submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="poolSubmission"></a>
# **poolSubmission**
> String poolSubmission(criteria)

Submission of pool form.

Process for pool form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
PoolFields criteria = new PoolFields(); // PoolFields | pool submission
try {
    String result = apiInstance.poolSubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#poolSubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**PoolFields**](PoolFields.md)| pool submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="providentSubmission"></a>
# **providentSubmission**
> String providentSubmission(criteria)

Submission of provident form.

Process for provident form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
ProvidentFields criteria = new ProvidentFields(); // ProvidentFields | provident submission
try {
    String result = apiInstance.providentSubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#providentSubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**ProvidentFields**](ProvidentFields.md)| provident submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="quadSubmission"></a>
# **quadSubmission**
> String quadSubmission(criteria)

Submission of quad form.

Process for quad form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
QuadFields criteria = new QuadFields(); // QuadFields | quad submission
try {
    String result = apiInstance.quadSubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#quadSubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**QuadFields**](QuadFields.md)| quad submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="realEstate"></a>
# **realEstate**
> String realEstate(criteria)

Submission of realEstate form.

Process for real estate form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
RealEstateFields criteria = new RealEstateFields(); // RealEstateFields | realEstate submission
try {
    String result = apiInstance.realEstate(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#realEstate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**RealEstateFields**](RealEstateFields.md)| realEstate submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retirementCapital"></a>
# **retirementCapital**
> String retirementCapital(criteria)

Submission of retirementCapital form.

Process for retirement capital form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
RetirementCapitalFields criteria = new RetirementCapitalFields(); // RetirementCapitalFields | retirementCapital submission
try {
    String result = apiInstance.retirementCapital(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#retirementCapital");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**RetirementCapitalFields**](RetirementCapitalFields.md)| retirementCapital submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rightSubmission"></a>
# **rightSubmission**
> String rightSubmission(criteria)

Submission of rights form.

Process for right form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
RightsFields criteria = new RightsFields(); // RightsFields | rights submission
try {
    String result = apiInstance.rightSubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#rightSubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**RightsFields**](RightsFields.md)| rights submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rototillerSubmission"></a>
# **rototillerSubmission**
> String rototillerSubmission(criteria)

Submission of rototiller form.

Process for rototiller form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
RototillerFields criteria = new RototillerFields(); // RototillerFields | rototiller submission
try {
    String result = apiInstance.rototillerSubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#rototillerSubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**RototillerFields**](RototillerFields.md)| rototiller submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="savingTax"></a>
# **savingTax**
> String savingTax(criteria)

Submission of SavingTax form.

Process for SavingTax form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
SavingTaxFields criteria = new SavingTaxFields(); // SavingTaxFields | savingTax submission
try {
    String result = apiInstance.savingTax(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#savingTax");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**SavingTaxFields**](SavingTaxFields.md)| savingTax submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="schoolSubmission"></a>
# **schoolSubmission**
> String schoolSubmission(criteria)

Submission of school form.

Process for school form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
SchoolFields criteria = new SchoolFields(); // SchoolFields | school submission
try {
    String result = apiInstance.schoolSubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#schoolSubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**SchoolFields**](SchoolFields.md)| school submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="socialSubmission"></a>
# **socialSubmission**
> String socialSubmission(criteria)

Submission of social form.

Process for social form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
SocialFields criteria = new SocialFields(); // SocialFields | social submission
try {
    String result = apiInstance.socialSubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#socialSubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**SocialFields**](SocialFields.md)| social submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sporthighSubmission"></a>
# **sporthighSubmission**
> String sporthighSubmission(criteria)

Submission of sporthigh form.

Process for sporthigh form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
SporthighFields criteria = new SporthighFields(); // SporthighFields | sporthigh submission
try {
    String result = apiInstance.sporthighSubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#sporthighSubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**SporthighFields**](SporthighFields.md)| sporthigh submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sportlowSubmission"></a>
# **sportlowSubmission**
> String sportlowSubmission(criteria)

Submission of sports low level form.

Process for sports low level form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
SportlowFields criteria = new SportlowFields(); // SportlowFields | sport low submission
try {
    String result = apiInstance.sportlowSubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#sportlowSubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**SportlowFields**](SportlowFields.md)| sport low submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="winecellarSubmission"></a>
# **winecellarSubmission**
> String winecellarSubmission(criteria)

Submission of wine cellar form.

Process for wine cellar form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
WinecellarFields criteria = new WinecellarFields(); // WinecellarFields | wine cellar submission
try {
    String result = apiInstance.winecellarSubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#winecellarSubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**WinecellarFields**](WinecellarFields.md)| wine cellar submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workstopSubmission"></a>
# **workstopSubmission**
> String workstopSubmission(criteria)

Submission of workstop form.

Process for workstop form submission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: forms_auth
OAuth forms_auth = (OAuth) defaultClient.getAuthentication("forms_auth");
forms_auth.setAccessToken("YOUR ACCESS TOKEN");

FormsApi apiInstance = new FormsApi();
WorkstopFields criteria = new WorkstopFields(); // WorkstopFields | workstop submission
try {
    String result = apiInstance.workstopSubmission(criteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#workstopSubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **criteria** | [**WorkstopFields**](WorkstopFields.md)| workstop submission |

### Return type

**String**

### Authorization

[forms_auth](../README.md#forms_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

