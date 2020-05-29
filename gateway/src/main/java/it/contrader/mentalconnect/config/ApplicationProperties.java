package it.contrader.mentalconnect.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to Gateway.
 * <p>
 * Properties are configured in the {@code application.yml} file.
 * See {@link io.github.jhipster.config.JHipsterProperties} for a good example.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {
	
	private final Security security = new Security();

	public Security getSecurity() {
		return security;
	}

	public static class Security {

		private final Authentication authentication = new Authentication();

		public Authentication getAuthentication() {
			return authentication;
		}

		public static class Authentication {

			private final Auth0 auth0 = new Auth0();

			public Auth0 getAuth0() {
				return auth0;
			}

			public static class Auth0 {

				private String audience;
				private String issuer;

				public String getAudience() {
					return audience;
				}

				public void setAudience(String audience) {
					this.audience = audience;
				}

				public String getIssuer() {
					return issuer;
				}

				public void setIssuer(String issuer) {
					this.issuer = issuer;
				}

			}
		}

	}
}
