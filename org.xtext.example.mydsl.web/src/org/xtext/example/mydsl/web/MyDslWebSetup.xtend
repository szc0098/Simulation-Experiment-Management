/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.web

import com.google.inject.Guice
import com.google.inject.Injector
import org.eclipse.xtext.util.Modules2
import org.xtext.example.mydsl.MyDslRuntimeModule
import org.xtext.example.mydsl.MyDslStandaloneSetup
import org.xtext.example.mydsl.ide.MyDslIdeModule

/**
 * Initialization support for running Xtext languages in web applications.
 */
class MyDslWebSetup extends MyDslStandaloneSetup {
	
	val Provider<ExecutorService> executorServiceProvider;
	
	override Injector createInjector() {
		val runtimeModule = new MyDslRuntimeModule()
		val webModule = new MyDslWebModule(executorServiceProvider)
		return Guice.createInjector(Modules.override(runtimeModule).with(webModule))
	}
	
}

