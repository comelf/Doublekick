package com.doublekick;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;
import org.sitemesh.content.tagrules.html.Sm2TagRuleBundle;

public class DKSiteMeshFilter extends  ConfigurableSiteMeshFilter {

	@Override
	protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
		builder.addTagRuleBundle(new Sm2TagRuleBundle());
		builder.addDecoratorPath("/academy/**", "/WEB-INF/jsp/academy/decorator.jsp");
		builder.addExcludedPath("/account/login");
		builder.addExcludedPath("/account/loginp");
		builder.addExcludedPath("/account/create");
		super.applyCustomConfiguration(builder);
	}
}
