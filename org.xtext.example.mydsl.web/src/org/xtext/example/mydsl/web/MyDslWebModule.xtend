/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.web


/**
 * Use this class to register additional components to be used within the web application.
 */
class MyDslWebModule extends AbstractMyDslWebModule {

	def void configureIPreferenceValuesProvider(Binder binder) {
		binder.bind(IPreferenceValuesProvider).annotatedWith(FormatterPreferences).to(FormatterPreferenceValuesProvider)
	}
	
	def Class<? extends XtextServiceDispatcher> bindXtextServiceDispatcher() {
		return MyDslXtextServiceDispatcher
	}
}
