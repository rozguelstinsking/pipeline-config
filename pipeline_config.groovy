libraries{
	merge = true
    	sonarqube
	gradle{
		message= "lalala"
		version= 4
	}
	kubernetes
}



allow_scm_jenkinsfile = false
// skip the default JTE checkout and do it explicitly
skip_default_checkout = true
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
