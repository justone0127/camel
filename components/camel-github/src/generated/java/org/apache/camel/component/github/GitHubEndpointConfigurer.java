/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.github;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class GitHubEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("type", org.apache.camel.component.github.GitHubType.class);
        map.put("branchName", java.lang.String.class);
        map.put("oauthToken", java.lang.String.class);
        map.put("password", java.lang.String.class);
        map.put("repoName", java.lang.String.class);
        map.put("repoOwner", java.lang.String.class);
        map.put("username", java.lang.String.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        map.put("encoding", java.lang.String.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("state", java.lang.String.class);
        map.put("targetUrl", java.lang.String.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("synchronous", boolean.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        GitHubEndpoint target = (GitHubEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "encoding": target.setEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "oauthtoken":
        case "oauthToken": target.setOauthToken(property(camelContext, java.lang.String.class, value)); return true;
        case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "reponame":
        case "repoName": target.setRepoName(property(camelContext, java.lang.String.class, value)); return true;
        case "repoowner":
        case "repoOwner": target.setRepoOwner(property(camelContext, java.lang.String.class, value)); return true;
        case "state": target.setState(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "targeturl":
        case "targetUrl": target.setTargetUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "username": target.setUsername(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        GitHubEndpoint target = (GitHubEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "encoding": return target.getEncoding();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "oauthtoken":
        case "oauthToken": return target.getOauthToken();
        case "password": return target.getPassword();
        case "reponame":
        case "repoName": return target.getRepoName();
        case "repoowner":
        case "repoOwner": return target.getRepoOwner();
        case "state": return target.getState();
        case "synchronous": return target.isSynchronous();
        case "targeturl":
        case "targetUrl": return target.getTargetUrl();
        case "username": return target.getUsername();
        default: return null;
        }
    }
}

