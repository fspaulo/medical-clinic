<template>
    <div class="q-pa-md">
        <q-table
            class="my-sticky-header-table"
            flat bordered
            title="Patients"
            :rows="dataTable"
            :columns="columns"
            row-key="name"
            style="height: calc(101vh - 100px); width: 100%"
        />
    </div>
</template>

<script>
import axios from 'axios'
import {ref} from "vue";

export default {
    name: "Patient",

    setup() {
        return {
            dataTable: ref([]),
            columns: [
                {
                    name: 'firstName',
                    required: true,
                    label: 'First Name',
                    align: 'left',
                    field: 'firstName',
                    sortable: true,
                    class: 'ellipsis',
                    style: 'max-width: 100px',
                    //headerStyle: 'max-width: 100px',
                    isEditable: false
                },
                {
                    name: 'lastName',
                    required: true,
                    label: 'Last Name',
                    align: 'left',
                    field: 'lastName',
                    sortable: true,
                    class: 'ellipsis',
                    style: 'max-width: 100px',
                    headerStyle: 'max-width: 100px',
                    isEditable: false
                },
                {
                    name: 'age',
                    required: true,
                    label: 'Age',
                    align: 'left',
                    field: 'age',
                    sortable: true,
                    isEditable: true
                },
                {
                    name: 'gender',
                    required: true,
                    label: 'Gender',
                    align: 'left',
                    field: 'gender',
                    sortable: true,
                    isEditable: true
                },
                {
                    name: 'phone',
                    required: true,
                    label: 'Phone Number',
                    align: 'left',
                    field: 'phone',
                    sortable: true,
                    isEditable: true
                }
            ]
        }
    },

    mounted() {
        this.getDataTable()
    },

    methods: {
        getDataTable() {
             axios.get('http://localhost:8080/v1/person')
                 .then(res => {
                     this.dataTable = res.data
                 })
                 .catch((err) => {
                     console.log(err)
                 })
        }
    }
}
</script>

<style scoped>

</style>
