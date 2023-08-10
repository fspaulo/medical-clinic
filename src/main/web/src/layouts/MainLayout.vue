<template>
    <q-layout view="hHh lpR fFf" class="bg-grey-1">
        <q-header elevated class="background text-white q-py-xs" height-hint="58">
            <q-toolbar>
                <q-btn
                    flat
                    dense
                    round
                    @click="toggleLeftDrawer"
                    aria-label="Menu"
                    icon="menu"
                />

                <q-btn flat no-caps no-wrap class="q-ml-xs" v-if="$q.screen.gt.xs">
                    <img
                        alt="Quasar logo"
                        src="~assets/23064371.png"
                        style="width: 30px; height: 30px"
                    >
                    <q-toolbar-title shrink class="text-weight-bold">
                        Medical Clinic App
                    </q-toolbar-title>
                </q-btn>

                <q-space/>

                <div class="YL__toolbar-input-container row no-wrap">
                    <q-input dense outlined square v-model="search" placeholder="Search" class="bg-white col"/>
                    <q-btn class="YL__toolbar-input-btn" color="grey-3" text-color="grey-8" icon="search" unelevated/>
                </div>

                <q-space/>

                <div class="q-gutter-sm row items-center no-wrap">
                    <q-btn round dense flat color="white" icon="video_call" v-if="$q.screen.gt.sm">
                        <q-tooltip>Create a video or post</q-tooltip>
                    </q-btn>
                    <q-btn round dense flat color="white" icon="apps" v-if="$q.screen.gt.sm">
                        <q-tooltip>Apps</q-tooltip>
                    </q-btn>
                    <q-btn round dense flat color="white" icon="message" v-if="$q.screen.gt.sm">
                        <q-tooltip>Messages</q-tooltip>
                    </q-btn>
                    <q-btn round dense flat color="white" icon="notifications">
                        <q-badge color="red" text-color="white" floating>
                            2
                        </q-badge>
                        <q-tooltip>Notifications</q-tooltip>
                    </q-btn>
                    <q-btn round flat>
                        <q-avatar size="26px">
                            <img src="https://cdn.quasar.dev/img/boy-avatar.png">
                        </q-avatar>
                        <q-tooltip>Account</q-tooltip>
                    </q-btn>
                </div>
            </q-toolbar>
        </q-header>

        <q-drawer
            v-model="leftDrawerOpen"
            show-if-above
            bordered
            class="bg-grey-2"
            :width="250"
        >
            <q-scroll-area class="fit">
                <q-list padding>
                    <q-item v-for="link in links1" :key="link.text" v-ripple clickable>
                        <q-item-section avatar>
                            <q-icon color="grey" :name="link.icon"/>
                        </q-item-section>
                        <q-item-section>
                            <q-item-label>{{ link.text }}</q-item-label>
                        </q-item-section>
                    </q-item>

                    <q-separator class="q-my-md"/>

                    <q-item v-for="link in links2" :key="link.text" v-ripple clickable :to="link.to">
                        <q-item-section avatar>
                            <q-icon color="grey" :name="link.icon"/>
                        </q-item-section>
                        <q-item-section>
                            <q-item-label>{{ link.text }}</q-item-label>
                        </q-item-section>
                    </q-item>

                    <q-item v-for="link in links3" :key="link.text" v-ripple clickable>
                        <q-item-section avatar>
                            <q-icon color="grey" :name="link.icon"/>
                        </q-item-section>
                        <q-item-section>
                            <q-item-label>{{ link.text }}</q-item-label>
                        </q-item-section>
                    </q-item>

                    <q-separator class="q-my-md"/>

                    <q-item v-for="link in links4" :key="link.text" v-ripple clickable>
                        <q-item-section avatar>
                            <q-icon color="grey" :name="link.icon"/>
                        </q-item-section>
                        <q-item-section>
                            <q-item-label>{{ link.text }}</q-item-label>
                        </q-item-section>
                    </q-item>

                    <q-separator class="q-mt-md q-mb-lg"/>

                    <div class="q-px-md text-grey-9">
                        <div class="row items-center q-gutter-x-sm q-gutter-y-xs">
                            <a
                                v-for="button in buttons1"
                                :key="button.text"
                                class="YL__drawer-footer-link"
                                href="javascript:void(0)"
                            >
                                {{ button.text }}
                            </a>
                        </div>
                    </div>
                </q-list>
            </q-scroll-area>
        </q-drawer>

        <q-page-container>
            <router-view/>
        </q-page-container>
    </q-layout>
</template>

<script>
import {ref} from 'vue'
import {fabYoutube} from '@quasar/extras/fontawesome-v6'

export default {
    name: 'MyLayout',

    setup() {
        const leftDrawerOpen = ref(false)
        const search = ref('')

        function toggleLeftDrawer() {
            leftDrawerOpen.value = !leftDrawerOpen.value
        }

        return {
            fabYoutube,

            leftDrawerOpen,
            search,

            toggleLeftDrawer,

            links1: [
                {icon: 'home', text: 'Home', to:'/'},
                {icon: 'calendar_today', text: 'Schedule', to:'/schedule'},
            ],
            links2: [
                {icon: 'patient_list', text: 'Patients', to:'/patients'},
                {icon: 'stethoscope', text: 'Doctors', to:'/doctors'},
                {icon: 'surgical', text: 'Procedures', to:'/patients'},
                //{icon: 'thumb_up_alt', text: 'Liked videos'}
            ],
            links4: [
                {icon: 'supervisor_account', text: 'System Users', to:'/'}, // abrir dialogo qnd clicar
                {icon: 'settings', text: 'Settings', to:'/'},
                {icon: 'help', text: 'Help', to:'/'},
            ],
            buttons1: [
                {text: 'About'},
                {text: 'Press'},
                {text: 'Copyright'},
                {text: 'Contact us'},
            ],
        }
    }
}
</script>

<style lang="scss">
.background {
    background-color: #1b5886;
}
</style>

<style lang="sass">
.YL

    &__toolbar-input-container
        min-width: 100px
        width: 55%

    &__toolbar-input-btn
        border-radius: 0
        border-style: solid
        border-width: 1px 1px 1px 0
        border-color: rgba(0, 0, 0, .24)
        max-width: 60px
        width: 100%

    &__drawer-footer-link
        color: inherit
        text-decoration: none
        font-weight: 500
        font-size: .75rem

        &:hover
            color: #000
</style>
