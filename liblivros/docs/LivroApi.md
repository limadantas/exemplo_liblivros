# LivroApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**atualizarLivro**](LivroApi.md#atualizarLivro) | **PUT** /livro/{codigo} | Atualiza os dados de um livro
[**buscarPorCodigo**](LivroApi.md#buscarPorCodigo) | **GET** /livro/{codigo} | Buscar livro por código
[**criarLivro**](LivroApi.md#criarLivro) | **POST** /livro | Cadastrar um novo livro
[**listarLivros**](LivroApi.md#listarLivros) | **GET** /livro | Listar todos os livros
[**removeLivro**](LivroApi.md#removeLivro) | **DELETE** /livro/{codigo} | Exclui um livro



## atualizarLivro

> atualizarLivro(codigo, body)

Atualiza os dados de um livro

Atualiza os dados de um livro pelo código

### Example

```java
// Import classes:
import com.douglas.invoker.ApiClient;
import com.douglas.invoker.ApiException;
import com.douglas.invoker.Configuration;
import com.douglas.invoker.models.*;
import com.douglas.livros_service.api.LivroApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        LivroApi apiInstance = new LivroApi(defaultClient);
        String codigo = "codigo_example"; // String | Código do livro a ser atualizado
        InlineObject1 body = new InlineObject1(); // InlineObject1 | 
        try {
            apiInstance.atualizarLivro(codigo, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling LivroApi#atualizarLivro");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codigo** | **String**| Código do livro a ser atualizado |
 **body** | [**InlineObject1**](InlineObject1.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **405** | Invalid input |  -  |


## buscarPorCodigo

> InlineResponse200 buscarPorCodigo(codigo)

Buscar livro por código

Retorna o livro pelo código

### Example

```java
// Import classes:
import com.douglas.invoker.ApiClient;
import com.douglas.invoker.ApiException;
import com.douglas.invoker.Configuration;
import com.douglas.invoker.models.*;
import com.douglas.livros_service.api.LivroApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        LivroApi apiInstance = new LivroApi(defaultClient);
        Long codigo = 56L; // Long | Código do livro a ser retornado
        try {
            InlineResponse200 result = apiInstance.buscarPorCodigo(codigo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LivroApi#buscarPorCodigo");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codigo** | **Long**| Código do livro a ser retornado |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Código inválido |  -  |
| **404** | Livro não encontrado |  -  |


## criarLivro

> criarLivro(body)

Cadastrar um novo livro

### Example

```java
// Import classes:
import com.douglas.invoker.ApiClient;
import com.douglas.invoker.ApiException;
import com.douglas.invoker.Configuration;
import com.douglas.invoker.models.*;
import com.douglas.livros_service.api.LivroApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        LivroApi apiInstance = new LivroApi(defaultClient);
        InlineObject body = new InlineObject(); // InlineObject | 
        try {
            apiInstance.criarLivro(body);
        } catch (ApiException e) {
            System.err.println("Exception when calling LivroApi#criarLivro");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject**](InlineObject.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **405** | Entrada inválida |  -  |


## listarLivros

> List&lt;InlineResponse200&gt; listarLivros()

Listar todos os livros

Retorna a lista de livros do sistema

### Example

```java
// Import classes:
import com.douglas.invoker.ApiClient;
import com.douglas.invoker.ApiException;
import com.douglas.invoker.Configuration;
import com.douglas.invoker.models.*;
import com.douglas.livros_service.api.LivroApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        LivroApi apiInstance = new LivroApi(defaultClient);
        try {
            List<InlineResponse200> result = apiInstance.listarLivros();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LivroApi#listarLivros");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;InlineResponse200&gt;**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **400** | Requisição inválida |  -  |


## removeLivro

> removeLivro(codigo)

Exclui um livro

Apaga um livro pelo código

### Example

```java
// Import classes:
import com.douglas.invoker.ApiClient;
import com.douglas.invoker.ApiException;
import com.douglas.invoker.Configuration;
import com.douglas.invoker.models.*;
import com.douglas.livros_service.api.LivroApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        LivroApi apiInstance = new LivroApi(defaultClient);
        Integer codigo = 56; // Integer | Código do livro a ser removido
        try {
            apiInstance.removeLivro(codigo);
        } catch (ApiException e) {
            System.err.println("Exception when calling LivroApi#removeLivro");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codigo** | **Integer**| Código do livro a ser removido |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Código inválido |  -  |
| **404** | Livro não encontrado |  -  |

