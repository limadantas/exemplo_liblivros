package com.douglas.livros_service.api;

import com.douglas.invoker.ApiClient;

import com.douglas.livros.model.InlineObject;
import com.douglas.livros.model.InlineObject1;
import com.douglas.livros.model.InlineResponse200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-26T17:36:30.699353-03:00[America/Sao_Paulo]")
@Component("com.douglas.livros_service.api.LivroApi")
public class LivroApi {
    private ApiClient apiClient;

    public LivroApi() {
        this(new ApiClient());
    }

    @Autowired
    public LivroApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Atualiza os dados de um livro
     * Atualiza os dados de um livro pelo código
     * <p><b>405</b> - Invalid input
     * @param codigo Código do livro a ser atualizado (required)
     * @param body  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void atualizarLivro(String codigo, InlineObject1 body) throws RestClientException {
        atualizarLivroWithHttpInfo(codigo, body);
    }

    /**
     * Atualiza os dados de um livro
     * Atualiza os dados de um livro pelo código
     * <p><b>405</b> - Invalid input
     * @param codigo Código do livro a ser atualizado (required)
     * @param body  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> atualizarLivroWithHttpInfo(String codigo, InlineObject1 body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'codigo' is set
        if (codigo == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'codigo' when calling atualizarLivro");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling atualizarLivro");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("codigo", codigo);
        String path = apiClient.expandPath("/livro/{codigo}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Buscar livro por código
     * Retorna o livro pelo código
     * <p><b>200</b> - OK
     * <p><b>400</b> - Código inválido
     * <p><b>404</b> - Livro não encontrado
     * @param codigo Código do livro a ser retornado (required)
     * @return InlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse200 buscarPorCodigo(Long codigo) throws RestClientException {
        return buscarPorCodigoWithHttpInfo(codigo).getBody();
    }

    /**
     * Buscar livro por código
     * Retorna o livro pelo código
     * <p><b>200</b> - OK
     * <p><b>400</b> - Código inválido
     * <p><b>404</b> - Livro não encontrado
     * @param codigo Código do livro a ser retornado (required)
     * @return ResponseEntity&lt;InlineResponse200&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse200> buscarPorCodigoWithHttpInfo(Long codigo) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'codigo' is set
        if (codigo == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'codigo' when calling buscarPorCodigo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("codigo", codigo);
        String path = apiClient.expandPath("/livro/{codigo}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<InlineResponse200> returnType = new ParameterizedTypeReference<InlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Cadastrar um novo livro
     * 
     * <p><b>405</b> - Entrada inválida
     * @param body  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void criarLivro(InlineObject body) throws RestClientException {
        criarLivroWithHttpInfo(body);
    }

    /**
     * Cadastrar um novo livro
     * 
     * <p><b>405</b> - Entrada inválida
     * @param body  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> criarLivroWithHttpInfo(InlineObject body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling criarLivro");
        }
        
        String path = apiClient.expandPath("/livro", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Listar todos os livros
     * Retorna a lista de livros do sistema
     * <p><b>200</b> - Ok
     * <p><b>400</b> - Requisição inválida
     * @return List&lt;InlineResponse200&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<InlineResponse200> listarLivros() throws RestClientException {
        return listarLivrosWithHttpInfo().getBody();
    }

    /**
     * Listar todos os livros
     * Retorna a lista de livros do sistema
     * <p><b>200</b> - Ok
     * <p><b>400</b> - Requisição inválida
     * @return ResponseEntity&lt;List&lt;InlineResponse200&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<InlineResponse200>> listarLivrosWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/livro", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<InlineResponse200>> returnType = new ParameterizedTypeReference<List<InlineResponse200>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Exclui um livro
     * Apaga um livro pelo código
     * <p><b>400</b> - Código inválido
     * <p><b>404</b> - Livro não encontrado
     * @param codigo Código do livro a ser removido (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void removeLivro(Integer codigo) throws RestClientException {
        removeLivroWithHttpInfo(codigo);
    }

    /**
     * Exclui um livro
     * Apaga um livro pelo código
     * <p><b>400</b> - Código inválido
     * <p><b>404</b> - Livro não encontrado
     * @param codigo Código do livro a ser removido (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> removeLivroWithHttpInfo(Integer codigo) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'codigo' is set
        if (codigo == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'codigo' when calling removeLivro");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("codigo", codigo);
        String path = apiClient.expandPath("/livro/{codigo}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
