import axios from "axios"
import { baseURL } from "./constants"

export class SiteUserController {
    static async getAll() {
        const respone = await axios.get(`${baseURL}/siteUsers/getAll`)
        return respone.data
    }

    static async createSiteUser(siteUserDTO) {
        const respone = await axios.post(`${baseURL}/siteUsers/createUser`, siteUserDTO)
        return respone.data
    }


    static async updateSiteUser(siteUserDTO) {
        const respone = await axios.patch(`${baseURL}/siteUsers/updateUser`, siteUserDTO)
        return respone.data
    }


    static async deleteSiteUser(siteUserDTO) {
        const respone = await axios.delete(`${baseURL}/siteUsers/deleteUser`, {
            data: siteUserDTO
        })
        return respone.data
    }
}