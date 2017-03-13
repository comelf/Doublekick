package com.doublekick;

import org.springframework.core.io.Resource;
import org.springframework.web.servlet.resource.VersionStrategy;

public class FixedStaticVersionStrategy implements VersionStrategy {

	public String fixedVersion;

	protected FixedStaticVersionStrategy() {
	}

	public FixedStaticVersionStrategy(String version) {
		this.fixedVersion = version;
	}

	@Override
	public String extractVersion(String requestPath) {
		return requestPath;
	}

	@Override
	public String removeVersion(String requestPath, String version) {
		return requestPath;
	}

	@Override
	public String addVersion(String requestPath, String version) {
		return requestPath + "?v=" + fixedVersion;
	}

	@Override
	public String getResourceVersion(Resource resource) {
		return fixedVersion;
	}

}
