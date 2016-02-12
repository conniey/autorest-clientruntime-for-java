/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.url;

import com.microsoft.rest.ServiceClient;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Initializes a new instance of the AutoRestUrlTestService class.
 */
public final class AutoRestUrlTestServiceImpl extends ServiceClient implements AutoRestUrlTestService {
    /**
     * The URI used as the base for all cloud service requests.
     */
    private final String baseUri;

    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return The BaseUri value.
     */
    public String getBaseUri() {
        return this.baseUri;
    }

    /** A string value 'globalItemStringPath' that appears in the path. */
    private String globalStringPath;

    /**
     * Gets A string value 'globalItemStringPath' that appears in the path.
     *
     * @return the globalStringPath value.
     */
    public String getGlobalStringPath() {
        return this.globalStringPath;
    }

    /**
     * Sets A string value 'globalItemStringPath' that appears in the path.
     *
     * @param globalStringPath the globalStringPath value.
     */
    public void setGlobalStringPath(String globalStringPath) {
        this.globalStringPath = globalStringPath;
    }

    /** should contain value null. */
    private String globalStringQuery;

    /**
     * Gets should contain value null.
     *
     * @return the globalStringQuery value.
     */
    public String getGlobalStringQuery() {
        return this.globalStringQuery;
    }

    /**
     * Sets should contain value null.
     *
     * @param globalStringQuery the globalStringQuery value.
     */
    public void setGlobalStringQuery(String globalStringQuery) {
        this.globalStringQuery = globalStringQuery;
    }

    /**
     * Gets the PathsOperations object to access its operations.
     * @return the PathsOperations object.
     */
    public PathsOperations getPathsOperations() {
        return new PathsOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the QueriesOperations object to access its operations.
     * @return the QueriesOperations object.
     */
    public QueriesOperations getQueriesOperations() {
        return new QueriesOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the PathItemsOperations object to access its operations.
     * @return the PathItemsOperations object.
     */
    public PathItemsOperations getPathItemsOperations() {
        return new PathItemsOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Initializes an instance of AutoRestUrlTestService client.
     */
    public AutoRestUrlTestServiceImpl() {
        this("http://localhost");
    }

    /**
     * Initializes an instance of AutoRestUrlTestService client.
     *
     * @param baseUri the base URI of the host
     */
    public AutoRestUrlTestServiceImpl(String baseUri) {
        super();
        this.baseUri = baseUri;
        initialize();
    }

    /**
     * Initializes an instance of AutoRestUrlTestService client.
     *
     * @param baseUri the base URI of the host
     * @param clientBuilder the builder for building up an {@link OkHttpClient}
     * @param retrofitBuilder the builder for building up a {@link Retrofit}
     */
    public AutoRestUrlTestServiceImpl(String baseUri, OkHttpClient.Builder clientBuilder, Retrofit.Builder retrofitBuilder) {
        super(clientBuilder, retrofitBuilder);
        this.baseUri = baseUri;
        initialize();
    }

    @Override
    protected void initialize() {
        super.initialize();
        this.retrofitBuilder.baseUrl(baseUri);
    }
}
