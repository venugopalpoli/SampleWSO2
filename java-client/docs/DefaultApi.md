# DefaultApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**borrowerBorrowerIdDelete**](DefaultApi.md#borrowerBorrowerIdDelete) | **DELETE** /borrower/{borrowerId} | 
[**borrowerBorrowerIdGet**](DefaultApi.md#borrowerBorrowerIdGet) | **GET** /borrower/{borrowerId} | 
[**borrowerGet**](DefaultApi.md#borrowerGet) | **GET** /borrower | 
[**borrowerPost**](DefaultApi.md#borrowerPost) | **POST** /borrower | 
[**borrowerPut**](DefaultApi.md#borrowerPut) | **PUT** /borrower | 


<a name="borrowerBorrowerIdDelete"></a>
# **borrowerBorrowerIdDelete**
> borrowerBorrowerIdDelete(borrowerId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String borrowerId = "borrowerId_example"; // String | 
try {
    apiInstance.borrowerBorrowerIdDelete(borrowerId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#borrowerBorrowerIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **borrowerId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="borrowerBorrowerIdGet"></a>
# **borrowerBorrowerIdGet**
> borrowerBorrowerIdGet(borrowerId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String borrowerId = "borrowerId_example"; // String | 
try {
    apiInstance.borrowerBorrowerIdGet(borrowerId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#borrowerBorrowerIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **borrowerId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="borrowerGet"></a>
# **borrowerGet**
> borrowerGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    apiInstance.borrowerGet();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#borrowerGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="borrowerPost"></a>
# **borrowerPost**
> borrowerPost(payload)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Payload1 payload = new Payload1(); // Payload1 | Request Body
try {
    apiInstance.borrowerPost(payload);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#borrowerPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**Payload1**](Payload1.md)| Request Body | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="borrowerPut"></a>
# **borrowerPut**
> borrowerPut(payload)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Payload payload = new Payload(); // Payload | Request Body
try {
    apiInstance.borrowerPut(payload);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#borrowerPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**Payload**](Payload.md)| Request Body | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

