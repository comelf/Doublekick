package com.doublekick;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;
import org.sitemesh.content.tagrules.html.Sm2TagRuleBundle;

public class DKSiteMeshFilter extends  ConfigurableSiteMeshFilter {

	@Override
	protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
		builder.addDecoratorPath("/*", "/WEB-INF/jsp/decorator.jsp");
		builder.addTagRuleBundle(new Sm2TagRuleBundle());
		builder.addExcludedPath("/login");
		builder.addExcludedPath("/loginp");
		builder.addExcludedPath("/create");
		super.applyCustomConfiguration(builder);
	}
}
