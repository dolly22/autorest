/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http;

import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.AutoRestBaseUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Initializes a new instance of the AutoRestHttpInfrastructureTestService class.
 */
public final class AutoRestHttpInfrastructureTestServiceImpl extends ServiceClient implements AutoRestHttpInfrastructureTestService {
    /**
     * The URL used as the base for all cloud service requests.
     */
    private final AutoRestBaseUrl baseUrl;

    /**
     * Gets the URL used as the base for all cloud service requests.
     *
     * @return The BaseUrl value.
     */
    public AutoRestBaseUrl getBaseUrl() {
        return this.baseUrl;
    }

    /**
     * Gets the HttpFailureOperations object to access its operations.
     * @return the HttpFailureOperations object.
     */
    public HttpFailureOperations getHttpFailureOperations() {
        return new HttpFailureOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the HttpSuccessOperations object to access its operations.
     * @return the HttpSuccessOperations object.
     */
    public HttpSuccessOperations getHttpSuccessOperations() {
        return new HttpSuccessOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the HttpRedirectsOperations object to access its operations.
     * @return the HttpRedirectsOperations object.
     */
    public HttpRedirectsOperations getHttpRedirectsOperations() {
        return new HttpRedirectsOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the HttpClientFailureOperations object to access its operations.
     * @return the HttpClientFailureOperations object.
     */
    public HttpClientFailureOperations getHttpClientFailureOperations() {
        return new HttpClientFailureOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the HttpServerFailureOperations object to access its operations.
     * @return the HttpServerFailureOperations object.
     */
    public HttpServerFailureOperations getHttpServerFailureOperations() {
        return new HttpServerFailureOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the HttpRetryOperations object to access its operations.
     * @return the HttpRetryOperations object.
     */
    public HttpRetryOperations getHttpRetryOperations() {
        return new HttpRetryOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the MultipleResponsesOperations object to access its operations.
     * @return the MultipleResponsesOperations object.
     */
    public MultipleResponsesOperations getMultipleResponsesOperations() {
        return new MultipleResponsesOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Initializes an instance of AutoRestHttpInfrastructureTestService client.
     */
    public AutoRestHttpInfrastructureTestServiceImpl() {
        this("http://localhost");
    }

    /**
     * Initializes an instance of AutoRestHttpInfrastructureTestService client.
     *
     * @param baseUrl the base URL of the host
     */
    public AutoRestHttpInfrastructureTestServiceImpl(String baseUrl) {
        super();
        this.baseUrl = new AutoRestBaseUrl(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestHttpInfrastructureTestService client.
     *
     * @param baseUrl the base URL of the host
     * @param clientBuilder the builder for building up an {@link OkHttpClient}
     * @param retrofitBuilder the builder for building up a {@link Retrofit}
     */
    public AutoRestHttpInfrastructureTestServiceImpl(String baseUrl, OkHttpClient.Builder clientBuilder, Retrofit.Builder retrofitBuilder) {
        super(clientBuilder, retrofitBuilder);
        this.baseUrl = new AutoRestBaseUrl(baseUrl);
        initialize();
    }

    @Override
    protected void initialize() {
        super.initialize();
        this.retrofitBuilder.baseUrl(baseUrl);
    }
}
