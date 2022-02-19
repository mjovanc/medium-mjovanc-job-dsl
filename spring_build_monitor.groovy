//---------------------------------------------------------------------------------
// spring_build_monitor.groovy
//---------------------------------------------------------------------------------
// Defines build monitor views for Spring API
//---------------------------------------------------------------------------------

buildMonitorView('Spring-API') {
    description('Spring API master')

    recurse()

    jobs {
        name('master')
    }

    configure { project -> 
        (project / config / displayCommitters ).value = true
        (project / config / buildFailureAnalyzerDisplayedField).value = Name
    }
}