package org.owly.duckdns.quarkus.test.cache;

import io.quarkus.security.identity.AuthenticationRequestContext;
import io.quarkus.security.identity.IdentityProvider;
import io.quarkus.security.identity.SecurityIdentity;
import io.quarkus.security.identity.request.AnonymousAuthenticationRequest;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SomethingIdentityProvider implements IdentityProvider<AnonymousAuthenticationRequest> {
    @Override
    public Class<AnonymousAuthenticationRequest> getRequestType() {
        return AnonymousAuthenticationRequest.class;
    }

    @Override
    public Uni<SecurityIdentity> authenticate(AnonymousAuthenticationRequest request, AuthenticationRequestContext context) {
        return null;
    }
}
