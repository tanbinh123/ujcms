System.register(["./vendor-legacy.0dfeed76.js","./index-legacy.1d1936e1.js"],(function(e){"use strict";var l,a,r,t,u,s,o,n,d,i,p,c,m,f,v,y,w,x,g,h;return{setters:[function(e){l=e.g,a=e.D,r=e.B,t=e.p,u=e.G,s=e.q,o=e.n,n=e.w,d=e.m,i=e.o,p=e.j,c=e.v,m=e.k,f=e.Q,v=e.a4,y=e.I,w=e.K,x=e.y,g=e.x},function(e){h=e.l}],execute:function(){const b={class:"h-full p-3 bg-gray-100"},q=g("h3",{class:"py-5 text-center text-3xl font-bold text-primary"},"UJCMS",-1);e("default",l({setup(e){const l=a(),g=a({}),V=a(null),k=a(!1),$=a(null),_=r(),j=t();u((()=>{$.value=_.query.redirect}));const C=()=>{l.value.validate((async e=>{if(e){k.value=!0;try{const e=await h(g.value);if(0!==e.status)return void(V.value=e.message);$.value?j.push($.value):window.location.reload()}finally{k.value=!1}}}))};return(e,a)=>{const r=d("el-alert"),t=d("el-input"),u=d("el-form-item"),h=d("el-button"),$=d("el-form");return i(),s("div",b,[o($,{ref_key:"form",ref:l,model:g.value,class:"mx-auto md:max-w-xs"},{default:n((()=>[q,V.value?(i(),p(r,{key:0,title:V.value,type:"error",class:"mb-3",closable:!1,"show-icon":""},null,8,["title"])):c("",!0),o(u,{prop:"username",rules:[{required:!0,message:()=>e.$t("v.required")}]},{default:n((()=>[o(t,{ref:"username",modelValue:g.value.username,"onUpdate:modelValue":a[0]||(a[0]=e=>g.value.username=e),type:"text",name:"username",placeholder:e.$t("username"),"prefix-icon":m(f),autocomplete:"on"},null,8,["modelValue","placeholder","prefix-icon"])])),_:1},8,["rules"]),o(u,{prop:"password",rules:[{required:!0,message:()=>e.$t("v.required")}]},{default:n((()=>[o(t,{ref:"password",modelValue:g.value.password,"onUpdate:modelValue":a[1]||(a[1]=e=>g.value.password=e),type:"password",name:"password",placeholder:e.$t("password"),"prefix-icon":m(v),"show-password":""},null,8,["modelValue","placeholder","prefix-icon"])])),_:1},8,["rules"]),o(h,{type:"primary","native-type":"submit",class:"w-full",loading:k.value,onClick:y(C,["prevent"])},{default:n((()=>[w(x(e.$t("login")),1)])),_:1},8,["loading","onClick"])])),_:1},8,["model"])])}}}))}}}));