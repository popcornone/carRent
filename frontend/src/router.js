
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import CarRentSystemManager from "./components/listers/CarRentSystemCards"
import CarRentSystemDetail from "./components/listers/CarRentSystemDetail"

import VehicleManagementSystemManager from "./components/listers/VehicleManagementSystemCards"
import VehicleManagementSystemDetail from "./components/listers/VehicleManagementSystemDetail"


import TotalCarListView from "./components/TotalCarListView"
import TotalCarListViewDetail from "./components/TotalCarListViewDetail"
import MemberManagementSystemManager from "./components/listers/MemberManagementSystemCards"
import MemberManagementSystemDetail from "./components/listers/MemberManagementSystemDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/carRentSystems',
                name: 'CarRentSystemManager',
                component: CarRentSystemManager
            },
            {
                path: '/carRentSystems/:id',
                name: 'CarRentSystemDetail',
                component: CarRentSystemDetail
            },

            {
                path: '/vehicleManagementSystems',
                name: 'VehicleManagementSystemManager',
                component: VehicleManagementSystemManager
            },
            {
                path: '/vehicleManagementSystems/:id',
                name: 'VehicleManagementSystemDetail',
                component: VehicleManagementSystemDetail
            },


            {
                path: '/totalCarLists',
                name: 'TotalCarListView',
                component: TotalCarListView
            },
            {
                path: '/totalCarLists/:id',
                name: 'TotalCarListViewDetail',
                component: TotalCarListViewDetail
            },
            {
                path: '/memberManagementSystems',
                name: 'MemberManagementSystemManager',
                component: MemberManagementSystemManager
            },
            {
                path: '/memberManagementSystems/:id',
                name: 'MemberManagementSystemDetail',
                component: MemberManagementSystemDetail
            },



    ]
})
