# springboot-ocp4-s2i-hello
Spring boot Hello world deployment on ocp4 using s2i template

<b>Step1:</b> Please clone source code $ git clone https://github.com/malam84/springboot-ocp4-s2i-hello.git
</br></br>
<b>Step2:</b> $ oc new-app -f springboot-ocp4-s2i-hello/s2i-template.yaml
<br></br>
<b>Step3:</b> $ oc expose svc/springboot-ocp4-s2i-hello
  </br></br>
<b>Step4:</b> $ oc describe route
<br> <br>
<b>Step5:</b> Open url inside browser http://springboot-ocp4-s2i-hello-ocp4.your.domain.name.com/hello
  
