class GrailsRabbitmqManagementGrailsPlugin {
    def version = "0.1"
    def grailsVersion = "2.0 > *"
    def pluginExcludes = ["grails-app/views/error.gsp"]
    def title = "Grails Rabbitmq Management Plugin"
    def author = "Michael Rice"
    def authorEmail = "errr,errr@gmail.com"
    def description = "Uses the rabbitmq management api to interact with rabbit via http"

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/grails-rabbitmq-management"
    def version = "1.1.1"
    def grailsVersion = "2.0 > *"
    def license = "MIT"
    def issueManagement = [system: 'GITHUB', url: 'https://github.com/michaelrice/grails-rabbitmq-management/issues']
    def scm = [url: 'https://github.com/michaelrice/grails-rabbitmq-management']

    // Details of company behind the plugin (if there is one)
    // def organization = [ name: "My Company", url: "http://www.my-company.com/" ]

    // Any additional developers beyond the author specified above.
    // def developers = [ [ name: "Joe Bloggs", email: "joe@bloggs.net" ]]

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { ctx ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }

    def onShutdown = { event ->
        // TODO Implement code that is executed when the application shuts down (optional)
    }
}
