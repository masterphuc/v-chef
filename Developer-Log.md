Developer Log <br>
This is intended to be a collection of my thought process and journaling as I build.

- 12/20/2024 <br>
It's been awhile since I've committed myself to a new personal project so here I am
diving head first into an idea that might already have solutions out there haha, but
nevertheless, one that seems cool to build at home. <br>
I spent an hour watching a demo on Apache Cruise Control (ACC). This seems to mainly 
solve for the issue of balancing server load, but it doesn't address the issue of 
hot partition keys. <br>
Kafka has options to assist in repartitioning keys, and ultimately this seems like
something fun to implement. -shrug- <br>
Plan is to do some more further research into maybe a docker setup, will start
with something simple. <br>
Maybe something with Grafana and Openshift as that's what ACC used in their demo.
- 12/21/2024 <br>
Got setup with minikube for kubernetes cluster <br>
Deployed kafka in kubernetes using strimzi, still need to consider how I'll deploy a <br>
dynamic producer consumer later on
Might need to dynamically create yaml files to deploy the consumers/producers?<br>
Do I need to keep the state for the current producer then?<br>
Or can I modify the existing state of a running producer? -> perhaps an easy deploy wont 
be enough for this
- 12/24/2024 <br>
Looks like it would make a lot of sense for this demo project that I also include a build
for the producer and consumer since we need an orchestration of sort to control the flow
of data on the producer and consumer side <br>

