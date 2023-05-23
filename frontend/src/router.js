
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import DocumentManager from "./components/listers/DocumentCards"
import DocumentDetail from "./components/listers/DocumentDetail"

import TextDataManager from "./components/listers/TextDataCards"
import TextDataDetail from "./components/listers/TextDataDetail"

import VerificationResultManager from "./components/listers/VerificationResultCards"
import VerificationResultDetail from "./components/listers/VerificationResultDetail"

import TenantManager from "./components/listers/TenantCards"
import TenantDetail from "./components/listers/TenantDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/documents',
                name: 'DocumentManager',
                component: DocumentManager
            },
            {
                path: '/documents/:id',
                name: 'DocumentDetail',
                component: DocumentDetail
            },

            {
                path: '/textData',
                name: 'TextDataManager',
                component: TextDataManager
            },
            {
                path: '/textData/:id',
                name: 'TextDataDetail',
                component: TextDataDetail
            },

            {
                path: '/verificationResults',
                name: 'VerificationResultManager',
                component: VerificationResultManager
            },
            {
                path: '/verificationResults/:id',
                name: 'VerificationResultDetail',
                component: VerificationResultDetail
            },

            {
                path: '/tenants',
                name: 'TenantManager',
                component: TenantManager
            },
            {
                path: '/tenants/:id',
                name: 'TenantDetail',
                component: TenantDetail
            },



    ]
})
