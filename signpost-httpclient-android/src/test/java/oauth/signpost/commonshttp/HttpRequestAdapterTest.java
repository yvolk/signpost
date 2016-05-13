package oauth.signpost.commonshttp;

import oauth.signpost.basic.HttpRequestAdapterTestBase;

import cz.msebera.android.httpclient.client.methods.HttpPost;
import cz.msebera.android.httpclient.entity.StringEntity;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnit44Runner;

@RunWith(MockitoJUnit44Runner.class)
public class HttpRequestAdapterTest extends HttpRequestAdapterTestBase {

    @Override
    public void prepareRequest() throws Exception {
        HttpPost r = new HttpPost(URL);
        r.setHeader(HEADER_NAME, HEADER_VALUE);
        StringEntity body = new StringEntity(PAYLOAD);
        body.setContentType(CONTENT_TYPE);
        r.setEntity(body);
        request = new HttpRequestAdapter(r);
    }
}
