

allow_scm_jenkinsfile = false
// skip the default JTE checkout and do it explicitly
skip_default_checkout = false
// define application environment objects
application_environments{
    dev{
        long_name = "Development"
    }
    prod{
        long_name = "Production"
    }
}

/*
  define libraries to load.
  available libraries are based upon the
  library sources configured.

libraries{
    github
    sonarqube
    docker
    // library configurations are determined by
    // the specific library implementation
    openshift{
        url = "https://example.openshift.com"
        cred_id = "openshift"
    }
}
*/

libraries{
	merge = true
    	sonarqube
	gradle{
		merge=true
		message= "lalala"
		version= 4
	}
	kubernetes
}

template_methods{
    unit_test
    static_code_analysis
    build
    scan_container_image
    /* UAT
    penetration_test
    accessibility_compliance_test
    performance_test
    functional_test */
}

steps

